# encoding: utf-8
require_relative "blog"
require_relative "tweetable"

post = Blog::Post.new "José Mota", "A title", nil

post.insert_random_comment
post.insert_comment Blog::Comment.new user: nil, body:"No user"

post.print

# begin
#   post.tweet
# rescue Tweetable::NoBodyError
#   puts "No body was in the post ! :("
# ensure
#   # Here we close files no matter what (just like finally)
# end
