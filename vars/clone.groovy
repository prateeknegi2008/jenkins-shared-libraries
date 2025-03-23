def call( string url, string branch ) {
  echo 'Clone from GIT'
  git branch: branch, url: url
}
