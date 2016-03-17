require 'find'
require 'fileutils'
require 'pathname'

Find.find('.') do |path|
  match = /(\w*)\.md$/.match(path)
  next unless match
  pn = Pathname.new(path)
  new_path = "#{pn.dirname}/#{match[1]}.html.md"
  FileUtils.mv(path, new_path)
  puts "#{path} #{new_path}" if match
end
