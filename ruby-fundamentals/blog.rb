# encoding: utf-8
require_relative "tweetable"

module Blog

  class UserNotFound < StandardError; end

  class Post
    include Tweetable
    attr_reader :author, :title, :body, :comments

    # Default value for parameter.
    def initialize author, title, body, comments = []
      @author = author
      @title = title
      @body = body
      @comments = comments
    end

    # * = splash : liste de paramètres
    # def insert first, second, *thirds, options, &block
    def insert_comment *comments
      comments.each { |c| @comments << c }
    end

    def insert_random_comment
      @comments << Comment.new(user:"José Mota", body:"A body")
    end

    def print
      puts "This post is called : #{@title} and it has those comments:"
      begin
        @comments.each do |c|
          c.print
        end
      rescue UserNotFound => details
        puts "Error: #{details.message}"
      end
    end

  end

  class Comment
    include Tweetable
    attr_reader :user, :body

    def initialize options
      @user = options[:user]
      @body = options[:body]
    end

    def print
      raise UserNotFound, "Comment has no user" if @user.nil?
      puts "This comment was posted by #{@user} : #{@body}"
    end
  end
end
