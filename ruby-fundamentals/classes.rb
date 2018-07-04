class Car
  # Get/Set.
  attr_reader :state
  attr_writer :state
  # Both.
  # attr_accessor :state

  def initialize engine, tires
    @engine = engine
    @tires = tires
  end

  def start
    @state = "running"
    p "Car has started."
  end

  def stop
    @state = "stopped"
    p "Car has stopped."
  end
end

car = Car.new "My beautiful engine", [1, 2, 3, 4]

puts car.inspect

car.start

p "Car state : " + car.state

car.stop

p "Car state : " + car.state
