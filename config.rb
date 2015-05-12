###
# Tilt
###

###
# Compass
###

# Change Compass configuration
# compass_config do |config|
#   config.output_style = :compact
# end

###
# Page options, layouts, aliases and proxies
###

# Per-page layout changes:
#
# With no layout
# page "/path/to/file.html", :layout => false
#
# With alternative layout
# page "/path/to/file.html", :layout => :otherlayout
#
# A path which all have the same layout
# with_layout :admin do
#   page "/admin/*"
# end

# Proxy pages (http://middlemanapp.com/basics/dynamic-pages/)
# proxy "/this-page-has-no-template.html", "/template-file.html", :locals => {
#  :which_fake_page => "Rendering a fake page with a local variable" }



###
# Helpers
###

# Automatic image dimensions on image_tag helper
# activate :automatic_image_sizes

# Reload the browser automatically whenever files change
configure :development do
  activate :livereload
end

# Methods defined in the helpers block are available in templates
helpers do

  # Root links in left navbar. Expand (accordion style)
  # based on selected page
  def link_with_local_index(text, path)
    output = link_to(text, path)
    if current_page.url.include?(path)
      index = local_index(current_page.url)
      %(<li class="active">#{output}</li>#{index})
    else
      "<li>#{output}</li>"
    end
  end
  
  # Recurse up the document tree to build <li> for index
  def local_index(path, nested_index = "")
    puts "local_index(#{path}, #{nested_index})"
    # Ensure path refers to local directory
    current_path = path[/(.*\/).*$/, 1]

    # Done when model root is reached
    return nested_index if current_path =~ /^\/\w*\/$/

    local_pages = sitemap.resources.
                  select { |r| r.url.include?(current_path) }
    index = local_pages.reduce("") do |acc, r|
      link = link_to(r.data.title, r.url)
      # if r.path == current_page.path && r.path.include?('index.html') 
      #   # don't print current index
      #   acc
      if current_page.url == r.url # Active page
        acc << %(<li class="active">#{link}</li>)
      elsif current_page.url.include?(r.url) # Containing folder
        acc << "<li>#{link}</li>" + nested_index
      else
        acc << "<li>#{link}</li>"
      end
    end
    list = "<ul>#{index}</ul>"
    puts "list: #{list}"
    parent_folder = current_path[/(.*\/)\w*\//, 1]
    local_index(parent_folder, list)
  end

  def model_name
    current_page.data.model ? current_page.data.model.capitalize : ""
  end
  
  # def local_index
  #   output = sitemap.resources.select{|r| r.url.include?(current_page.url) and not r.path =~ /index\.html/}.reduce("<dl>\n") do |acc, r|
  #     acc + "<dt>#{link_to r.data.title, r.url}</dt>\n<dd>#{r.data.description}</dd>\n"
  #   end
  #   return output + "</dl>\n"
  # end

  def brief_index(path)
    output = sitemap.resources.select{|r| r.url.include?(path) && path != r.url }.sort_by{ |r| r.path}.reduce("<ul>\n") do |acc, r|
      puts '---'
      puts path 
      puts r.url
      acc + "<li>#{link_to r.data.title, r.url}</li>\n"
    end
    return output + "</ul>\n"
  end  

  def link_with_local_index_old(text, path)
    output = link_to(text, path)
    if current_page.url.include?(path)
      %(<li class="active">#{output}</li>#{brief_index(path)})
    else
      "<li>#{output}</li>"
    end
  end
  
  def example_path(example_id)
    "/allele/implementation/examples/#{example_id}.html"
  end

  def examples_index
    output = data.examples.sort_by{ |e| e['title'] }.reduce("<ul>\n") do |acc, e|
      acc + "<li>" + link_to(e['title'], example_path(e['id']))
    end
    return output + "</ul>"
  end
                                                                                           
  def link_with_examples_index(text, path)
    output = link_to(text, path)
    if current_page.url.include?(path)
      "<strong>#{output}</strong>#{examples_index}"
    else
      output
    end
  end

  def examples_table(resource_name)
    examples = data.examples.select do |example|
      example.resource == resource_name
    end
    header = '<table class="table"><thead><tr><th>id</th><th>name</th></tr></thead><tbody>'
    output = examples.reduce(header) do |acc, example|
      acc << '<tr>'
      acc << "<td>#{example['id']}</td>"
      acc << "<td>#{link_to example['title'], example_path(example['id']) }</td>"
      if example['jsonld']
        acc << "<td>#{link_to 'json-ld', example['jsonld']}</td>" 
      end
      acc << "<td>#{link_to 'xml', example['xml']}</td>"
      acc << "<td>#{link_to 'json', example['json']}</td>"
    end
    output + "</tbody></table>"
  end

  def render_markdown(content)
    Tilt['markdown'].new { content }.render
  end

end

set :css_dir, 'stylesheets'

set :js_dir, 'javascripts'

set :images_dir, 'images'

# Build-specific configuration
configure :build do
  # For example, change the Compass output style for deployment
  # activate :minify_css

  # Minify Javascript on build
  # activate :minify_javascript

  # Enable cache buster
  # activate :asset_hash

  # Use relative URLs
  # activate :relative_assets

  # Or use a different image path
  # set :http_prefix, "/Content/images/"
end


### Additonal custom configuration
# set :relative_links, true

data.examples.each do |e|
  proxy("/allele/implementation/examples/#{e['id']}.html",
       "/allele/implementation/examples/template.html",
       locals: e,
       ignore: true)
end

