# encoding: utf-8
require_relative "blog"

post = Blog::Post.new "José Mota", "A title", "A body"

# Another way :
# post.extend Tweetable
# Including a module for a single instance.

# post.insert_comment Blog::Comment.new(user: "Jeffrey", body:"Boddyyy")

post.insert_random_comment
post.insert_random_comment
post.insert_random_comment

# p post.inspect

post.tweet

post.comments.each { |c| c.tweet }
