print("Theodore Kyle Choa")
print("Grade 9- Gratitude")
print()
print("Quarterly Assessment")
print()

print("PART 1")
print("1. Parker must find the distance from Point A to Point B on opposite sides of a lake. He locates Point C that is 860 feet from point A and 175 feet from Point B. He measures the angle at Point C to be 78 degrees. Find the distance from point A to point B.")
print()
print("a = 175ft, b = 860ft, C = 75 degrees")                      
print("c^2 = a^2 + b^2 - 2ab cosC")   
print("c^2 = 30,625ft + 739,600ft - 2(175)(860)(sin75)")
print("c^2 = 30,625ft + 739,600ft - 62,581.42 = 707,643.58")
print("c = 841.22ft")

print()
print("2. A bridge is supported by triangular braces. If the sides of each brace have lengths 63 feet, 46 feet, and 40 feet, find the measure of the angle opposite the 46 ft side.")
print()
print("46^2 = 40^2 + 63^2 - 2(40)(63)cosA")
print("2116 = 1600 + 3969 - 5040cosA")
print("2116 - 1600 - 3969 = -5040cosA")
print("-3453 / -5040 = cosA")
print("cosA = 46.8 degrees")

print()
print("3. Matthew is planning to fertilize his grass. Each bag of fertilizer claims to cover 500sq.ft of grass. His property of land is approximately in the shape of a triangle. He measures two sides of his yard to be 75ft and 100fr and the angle between them is 72 °. How many bags of fertilizer must he buy?")
print()
print("Area = 1/2 (75)(100)(sin72)")
print("Area = 3566 sq.ft")
print("Bags = 3566/500 = 7.1")
print("Bags = 7")

print()
print("4. Find the Mean, Median and Mode of the given data set.")
print()
print("Mean: 1152.5/45 = 25.61")
print("Median: 45/2 = 22.5")
print("= 21.5 + (22.5 - 15 / 15) * 7")
print("= 25")
print("Or")
print("= 15.5 + (22.5 - 6 / 9) * 6")
print("= 26.5")
print("Mode: 21.5 + {[15 - 9] / [2(15) - 9 - 7]} * 7")
print("= 21.5 + (6 / 14) * 7 = 24.5")

print()
print("PART 2")
my_dictionary = {
  "Measure of Central Tendency -": "A central tendency is a central or typical value for a probability distribution. It may also be called a center or location of the distribution.",
  "Mean -": "Is the sum of a collection of numbers divided by the count of numbers in the collection.", 
  "Median -": "Is the value separating the higher half from the lower half of a data sample, a population, or a probability distribution.",
  "Mode -": "The mode is the value that appears most often in a set of data values.",
  "Kurtosis -": "Is a measure of the tailedness of the probability distribution of a real-valued random variable.",
}
  
for x,y in my_dictionary.items(): 
  print(x,y)