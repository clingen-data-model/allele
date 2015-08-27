#!/env/ruby

require 'git'

main_repo = Git.open(Dir.pwd)
puts main_repo.status
