# encoding: utf-8

class Post
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
end

class Comment
  attr_reader :user, :body

  def initialize options
    @user = options[:user]
    @body = options[:body]
  end
end

post = Post.new "José Mota", "My first post", "The post is awesome"

post.insert_comment Comment.new({user: "Jeffrey Way", body: "Nice post."}), Comment.new({user: "Jeffrey Way", body: "Nice post."}), Comment.new({user: "Jeffrey Way", body: "Nice post."})

p post.inspect

def method *list
  p list.inspect
end

method 1, 2, 3, 4, 5

args = [6, 7, 8]

# Splatting / squashing down the list.
method *args
