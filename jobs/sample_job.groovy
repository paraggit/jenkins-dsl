
job("MyProject-Build") {
    description "Builds MyProject from master branch."
    parameters {
        stringParam('COMMIT', 'HEAD', 'Commit to build')
    }
    steps {
        shell "Look: I'm building master!"
    }
}

// This accepts changes in the script approval section of 'Manage Jenkins'.

org.jenkinsci.plugins.scriptsecurity.scripts.ScriptApproval.get().with { approval ->
  approval.preapproveAll()
  approval.save()
}

