import com.typesafe.sbt.site.PamfletSupport._
import Docs._

lazy val root = (project in file("."))
  .settings(
    site.settings,
    site.pamfletSupport(),
    sourceDirectory in Pamflet := baseDirectory.value / "recipe"
  )
  // Github Pages. See project/Docs.scala
  // .settings(customGhPagesSettings: _*)
