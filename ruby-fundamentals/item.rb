class Item
  attr_reader :name

  def initialize name
    @id, @name = 1, name
  end

end

class SpecialItem < Item
  def initialize name, special_attributes
    super name
    @special_attributes = special_attributes
  end
end
