# encoding: utf-8

require "erb"
require "haml"
require 'erubis'
require "log4r"
require "./app"

logger = Log4r::Logger.new "app"
#logger.outputters << Log4r::Outputter.stdout
logger.outputters << Log4r::Outputter.stderr
file = Log4r::FileOutputter.new('app§file', :filename => 'log/app.log')
file.formatter = Log4r::PatternFormatter.new(:pattern => "[%l] %d :: %m")

logger.outputters << file

# .ru = rackup script.
run App
