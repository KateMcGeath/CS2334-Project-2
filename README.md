# CS2334-Project-2
MesoInherit:
To solve the calAverage method, I started by taking the split up stID in the array stationList 
and using a for loop to add together the ascii values. After this loop completes, I divided the 
value by the constant, ID_LENGTH. I then utilized the Math api methods, such as ceil, floor, and 
round, and then placed these values into a new array.
To solve the letterAverage method, I called the calAverage method and placed it into a new array.
I then took the int value at index 2 of the array and turned it into a char.

PosAvg:
I created two constructors in this class, one with no parameters and one with the stID as the 
parameter. I did this so I could call the getStationsArray method in other classes without having 
the stID. 
For the getStationsArray method, I first created the buffered reader and read through unnecessary
lines. I then created an array with an initial size of 10. I created a while loop to make sure that 
the lineOfData I was reading was not null. Then I checked to see if the array needed to be resized.
Next, I used the subString method on the lineOfData to get the station ID, I put this value in the 
listOfStations array. 
For the indexOfStation, I created a new array by calling the getStationsArray method. I then looped 
through the array and compared the index of the arrays contents to the stID. If the equaled, I breaked 
the loop and returned the index.
For the toString method, I called the indexOfStation method and subtracted one to account for the index 
starting at one. I then just called the array listOfStations with the index plus or minus 1 or 2.

LetterAvg:
I created one contructor with the parameter of a char. I then set this parameter to the value avg.
For the numberOfStationWithLetterAvg method, I called the getStationsArray method by creating an 
posAvg object. I then looped through this array and compared each stations first letter to the letter
average.
For the toString method, I created a PosAvg object again to call the getStationsArray. I then looped
through the array to compared the first letters values, and when one equalled 
the letter averge I added that station to the output.
