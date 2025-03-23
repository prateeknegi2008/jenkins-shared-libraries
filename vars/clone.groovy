def call( string url, string branch ) {
  echo 'Clone from GIT'
  git url: "${url}", branch: "${branch}"
}
