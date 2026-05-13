def call(String url, String branch){
  echo "copy the giturl"
  git url:"${url}", branch:"${branch}"
}
