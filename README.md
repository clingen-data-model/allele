# clingen-data-model
Documentation for data model of ClinGen

Read the documentation <a href="http://clingen-data-model.github.io/" target="_blank">here</a>

## Publishing the documentation

The documentation is hosted as a GitHub page (https://pages.github.com), based on the following repository:
https://github.com/clingen-data-model/clingen-data-model.github.io

The various versions of the site can be published using the build.rb tool located in the /lib directory. Simply run the tool using the command 'ruby lib/build.rb' **from the root directory of the project**, and checked in modifications across all versions of the model will be published to the public site.

There are a few things to keep in mind when publishing the site:

* Do this from a clean working directory; ensure all local changes are
  either committed or stashed.
* Be sure to run the command from the root directory of the project.
* Publishing to the remote git repository will only work if your GitHub
  user has been granted commit privileges on the repository. This should
  include all core members of the Data Model Working Group.



