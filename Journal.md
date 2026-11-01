# Journal

# Phase 1 

I created the NeuralMod class with a name, processing speed, and compatibility rating. I used an ArrayList to store the five mods. An ArrayList is useful because it can grow or shrink when items are added or removed, unlike a standard array.

# Phase 2 

I implemented the Comparable interface to sort the mods by processing speed. Natural order means the default way objects are sorted. I used compareTo to compare the speeds from lowest to highest.

# Phase 3 

I used Comparator to create a separate sorting method based on compatibility. Comparator is useful when you want to sort objects in different ways. I reversed the comparison so the highest compatibility rating appears first.

# Phase 4 

I updated compareTo to use three sorting rules. The program first compares speed, then compatibility if the speeds match, and finally the names alphabetically if both values match. This makes the registry more organized.
