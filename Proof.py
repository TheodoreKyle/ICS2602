def is_raining():
    return False  # Suppose it's not raining

def is_ground_wet():
    return is_raining()  # Ground is wet if it's raining

# Modus Tollens application
if not is_ground_wet():
    print("It is not raining.")  # Since the ground is not wet, we conclude no rain.

A = {1, 2, 3, 4, 5}
B = {3, 4, 5, 6, 7, 8}
C = {10, 20, 30}
D = {10, 20, 30, 40, 50, 60, 70}

union_set = A | B  # Union of A and B
intersection_set = A & B # Intersection of A and B
subset = C <= D # Subset of C and D, throws boolean 
superset = C >= D # Superset of C and D, throws boolean 
proper_subset = C < D
proper_superset = C > D
difference = D - C
print(union_set)  # Output: {1, 2, 3, 4, 5}
print(intersection_set)
print(subset)
print(superset) 
print(proper_subset) 
print(proper_superset)
print(difference) 