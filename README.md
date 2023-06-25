# Tasks for this project:
- Find and fix escaping references in Price
- Find and fix escaping references in BookCollection
- Find and fix escaping references in Book
- Fix the bug in Price.convert() method

The issue of escaping reference in the Price class could be fixed by means of three approaches:
- Create a copy of the base map "rates" and return it from the method Price.getRates(),
- Use the method Collections.unmodifiableMap() if you used a version of JVM below 1.10,
- Use the method Map.copyOf() if you used a version of JVM above 1.10.

The issue of escaping reference in the Book and BookCollection classes. The Book class implements 
an interface ReadOnlyBook and overrides all its abstract methods. The interface does not contain 
the setPrice() method. This helps to avoid an opportunity to modify Price objects. 
The method BookCollection.findBookByName() returns objects of the ReadOnlyBook type.

The bug in the method Price.convert() is fixed in two ways.
