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
# configure :development do
#   activate :livereload
# end

# Methods defined in the helpers block are available in templates
helpers do
  def local_index
    output = sitemap.resources.select{|r| r.url.include?(current_page.url) and not r.path =~ /index\.html/}.reduce("<dl>\n") do |acc, r|
      acc + "<dt>#{link_to r.data.title, r.url}</dt>\n<dd>#{r.data.description}</dd>\n"
    end
    return output + "</dl>\n"
  end

  def brief_index(path)
    output = sitemap.resources.select{|r| r.url.include?(path) and not r.path =~ /index\.html/}.reduce("<ul>\n") do |acc, r|
      acc + "<li>#{link_to r.data.title, r.url}</li>\n"
    end
    return output + "</ul>\n"
  end  

  def link_with_local_index(text, path)
    output = link_to(text, path)
    if current_page.url.include?(path)
      "<strong>#{output}</strong>#{brief_index(path)}"
    else
      output
    end
  end

  def examples_index
    output = data.examples.reduce("<ul>\n") do |acc, e|
      acc + "<li>" + link_to(e['title'],
                             "/allele/implementation/examples/#{e['id']}.html")
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

