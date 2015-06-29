import com.typesafe.sbt.site.PamfletSupport._

lazy val root = (project in file("."))
  .settings(
    organization := "com.eed3si9n",
    name := "recipe",
    site.settings,
    site.pamfletSupport(),
    sourceDirectory in Pamflet := baseDirectory.value / "recipe",
    ghpages.settings,
    git.remoteRepo := "git@github.com:eed3si9n/recipe.git"
  )
