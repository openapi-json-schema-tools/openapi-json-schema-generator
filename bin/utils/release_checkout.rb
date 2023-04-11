#!/usr/bin/env ruby
#
# release_checkout.rb
#
require 'rubygems'
require 'open-uri'
require 'net/http'

def check_openapi_generator_cli_docker
  print "Checking openapi-generator-cli docker ... "

  url = "https://hub.docker.com/v2/repositories/openapi-json-schema-tools/openapi-json-schema-generator-cli/tags/?page_size=25&page=1"
  docker_tag = "v#{$version}"
  open(url) do |f|
    content = f.read
    if !content.nil? && content.include?(docker_tag)
      puts "[OK]"
    else
      puts "[ERROR]"
      puts "> #{url} does not have tag #{docker_tag}"
    end
  end
end

def check_url url
  content = Net::HTTP.get(URI.parse(url))
  url = URI.parse(url)
  req = Net::HTTP.new(url.host, url.port)
  req.use_ssl = true
  res = req.request_head(url.path)
  if res.code == "200"
    true
  else
    false
  end
end

def usage
  puts "ERROR!! Version (e.g. 3.0.2) missing"
  puts "Usage example: ruby #{$0} 3.0.2"
end


if (!ARGV[0])
  usage
  exit
end

$version = ARGV[0]

puts "Running checkout on OpenAPI Generator release #{$version}"

check_openapi_generator_cli_docker
