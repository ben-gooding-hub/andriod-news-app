# Notes - Process Of Making + Decision Making

1. Initial used xml files to render screens, decided to restart using jetpack compose for the more modern approach

2. Read data in using json file reader, then parse to data classes declared in `models`
   1. Particularly happy about how the sealed classes parsed and using `when` statements to handle the Union of types exhaustively

3. 

3. Testing - I've laid out many scenario's for testing in the testing folder
   1. But I've left out the implementation, mainly due to time, and that I've had some issues with the mocking functionality for Kotlin/Andriod