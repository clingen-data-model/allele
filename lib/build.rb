#!/env/ruby

require 'git'
require 'yaml'
require 'fileutils'


# load the list of versions and delete the item
# corresponding to the master branch
versions = YAML.load_file('data/versions.yml')
versions.delete('development')

main_repo = Git.open(Dir.pwd)

# checkout each version in turn, build the documentation for that version,
# then copy it into the versioned folder under /stage
versions.each do |v|
  main_repo.checkout(v)
  # TODO check for and handle build errros
  `bundle exec middleman build`
  FileUtils.mv('build', "stage/#{v}")
end

# Finish by building current docs
main_repo.checkout
`bundle exec middleman build`
FileUtils.mv('build', "stage/development")


