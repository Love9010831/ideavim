package patches.vcsRoots

import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.ui.*
import jetbrains.buildServer.configs.kotlin.v2019_2.vcs.GitVcsRoot

/*
This patch script was generated by TeamCity on settings change in UI.
To apply the patch, create a vcsRoot with id = 'IdeaVimRepository1'
in the root project, and delete the patch script.
*/
create(DslContext.projectId, GitVcsRoot({
    id("IdeaVimRepository1")
    name = "IdeaVim Repository (1)"
    url = "git@github.com:JetBrains/ideavim.git"
    branch = "refs/heads/master"
    branchSpec = "refs/heads/*"
    authMethod = uploadedKey {
        uploadedKey = "IdeaVim ssh keys"
    }
    param("oauthProviderId", "tc-cloud-github-connection")
}))

