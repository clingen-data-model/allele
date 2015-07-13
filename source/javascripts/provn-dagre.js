provn_dagre = function(provnparser, provn) {

  var encode_entities = function(text) {
      var d = document.createElement('div');
      d.textContent = text;
      return d.innerHTML;
  }

  var errors = [];

  show_attributes = true;
  this.provnparser = provnparser;

  var g = new dagreD3.graphlib.Graph().setGraph({});
  this.g = g;

  var width = 1000,
      height = 1000;

  var svg = d3.select('#diagram').append('svg')
      .attr("preserveAspectRatio", "xMinYMin meet")
      .attr("viewBox", "0 0 800 800")
      .attr('class', 'prov-svg')

  var inner = svg.append('g');

  var render = new dagreD3.render();


  // Set up zoom support
  var zoom = d3.behavior.zoom().on("zoom", function() {
        inner.attr("transform", "translate(" + d3.event.translate + ")" +
                                    "scale(" + d3.event.scale + ")");
      });
  svg.call(zoom);

  this.init_diagram = function(provn) {
      errors = [];
      var errorDiv = document.getElementById('provn-errors');
      if (errorDiv) errorDiv.style.display = 'none';
      g.setGraph({});
      var nodeslinks = this.provnparser.parse(document.getElementById('provn').childNodes[0].textContent);
      var nd = nodeslinks.nodes;

      var nodes = Object.keys(nd).map(function (k) {
          var node = nd[k];
          g.setNode(k, node);
          if (show_attributes && node.label && node.attributes) {
              node.labelType = 'html';
              node.label = '<table class="provtable"><thead><tr><th colspan="2">' + encode_entities(node.label) + '</th></tr></thead>\n' +
                  node.attributes.map(function (av) {
                      return "<tr><td>" + encode_entities(av.attribute) + "</td><td>" + encode_entities(av.value) + "</td></tr>";
                  }).join('\n') + "</table>\n";
          }
      });

      nodeslinks.links.forEach(function (link) {
          if (!nd[link.source_node]) {
              errors.push("Reference to non-existant node: " + link.source_node);
              return;
          }
          if (!nd[link.target_node]) {
              errors.push("Reference to non-existant node: " + link.target_node);
              return;
          }
          g.setEdge(link.source_node, link.target_node, { label: link.label });
      });

      if (errors.length) {
          if (errorDiv) {
              errorDiv.style.display = 'block';
              errorDiv.innerHTML = '<ul>\n' + errors.map(function (e) {
                  return '  <li>' + encode_entities(e) + '</li>'
              }).join('\n') + '\n</ul>';
          } else {
              errors.forEach(function (e) { console.log(e); });
          }
      }
  }

  this.update_diagram = function() {

    render(inner, g);

    // Center the graph
    var initialScale = 1;
    zoom
      .translate([(parseInt(svg.style("width")) - g.graph().width * initialScale) / 2, 20])
      .scale(initialScale)
      .event(svg);
    svg.attr('height', g.graph().height * initialScale + 40);

  }

  if (provn) {
    this.init_diagram(provn);
    this.update_diagram();
  }

}
