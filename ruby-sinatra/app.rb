require "sinatra/base"
require "haml"
require 'erubis'

IMAGES = [
  {title: "Utopia", url: "/images/0.jpg"},
  {title: "Alaska", url: "/images/1.jpg"},
  {title: "The Unknown", url: "/images/2.jpg"},
]

class App < Sinatra::Base

  enable :sessions
  disable :show_exceptions

  configure do
    # Default environment.
    # set :environment, ENV["RACK_ENV"]
    # set :logging, true # same as enable :logging.
    # set :logging, false # same as desable
    # overrides the HTTP verb w/ _method input.
    # enable :method_override
    # name of the public folder.
    # set :public_folder, "public"
    # boolean, set :raise_errors
    # :root : root of the application (same of the sinatra app)
    # :sessions : use sessions.
    # :static : boolean, tells sinatra to fetch for static files in public
    # :views : set where is the views folder

    #set({foo: "bar", baz: "foo"})
    #settings.foo pour accéder à la var
  end

  configure :develoment do
  end

  configure :production do
  end

  not_found do
    haml :"404", layout: true, layout_engine: :erb
  end

  error do
    haml :error, layout: true, layout_engine: :erb
  end

  error 403 do
    haml :"403", layout: true, layout_engine: :erb
  end

  get "/500" do
    raise StandardError, "Intetional blowing up"
  end

  before do
    @user = "Joe Doe"
    @height = session[:height]
    @environment = settings.environment
    logger = Log4r::Logger["app"]
    logger.info "==> Entering request"
  end

  after do
    logger = Log4r::Logger["app"]
    logger.info "<== Leaving request"
  end

  # Regex
  before /images/ do
    @message = "You're viewing an image"
  end

  get "/sessions/new" do
    erb :"sessions/new"
  end

  post "/sessions" do
    # puts request.inspect
    session[:height] = params[:height]
  end

  get '/images' do
    halt 403 if sessions[:height].nil?
    @images = IMAGES
    erb :images, layout: true
  end

  get '/images/:index/download' do |index|
    index = index.to_i
    @image = IMAGES[index]
    attachment @image[:title]
    send_file "images/#{index}.jpg"
  end

  get '/images/:index.?:format?' do |index, format|
    index = index.to_i
    @index = index
    @image = IMAGES[index]

    if format == "jpg"
      content_type :jpg #image/jpeg
      send_file "images/#{index}.jpg"
    else
      haml :"images/show", layout: true
    end
  end

  get '/' do

  end

end
