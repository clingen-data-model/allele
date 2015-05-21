# clingen-data-model
Documentation for data model of ClinGen

Read the documentation <a href="http://clingen-data-model.github.io/" target="_blank">here</a>

## Publishing the documentation

The documentation is hosted as a GitHub page (https://pages.github.com), based on the following repository:
https://github.com/clingen-data-model/clingen-data-model.github.io

Publishing is currently a manual process, but is not overly complicated:

1. Clone the remote repository to the build directory

   `git clone https://github.com/tnavatar/clingen-data-model.git; cd clingen-data-model`
2. Build the site (requires [Ruby](http://ruby-lang.org) and [Bundler](http://bundler.io))

   `bundle exec middleman build`
3. Change to the build directory (cd build)
4. Stage new pages and push the repository to the remote site.
