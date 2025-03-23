def call( String url, String branch ) {
  echo 'Clone from GIT'
  git url: "${url}", branch: "${branch}"
}
