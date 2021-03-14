# geotab-assignment
Hello, 

I have completed my assignment to the best of my ability . Please find my comments regarding my thought process below :

1. I was unable to successfully build the project that I forked from the given geotab repository sign there some config issues due to the missing build.gradle file. I then decided to rework and start afresh by creating my own repo and a new project.
2. On execution of the java application, the program will prompt a user of the input, to get instructions, I surrounded this code in a try catch block to catch exceptions in an elegant way instead of the main thread breaking.
3. Once you enter the while loop user presses 'c' for categories or 'r' for random jokes
4. In case of 'c' input , it goes to the getCategories() method where I made the url change for the api , since it was pointing to the random joke url. I did not make changes in the JsonFeed.getCategories() method as it seemed to work fine . User gets categories. Now if the user decides to specify a category, it gets saved in the string and parsed to the getRandomJokes(string,int) method, else he is asked how many jokes he wants , and he gets random jokes.
5. the getRandomJokes() mehtod inputs the category which is strung to the JsonFeed.getRandomJokes(). Here teh url is updated based on the category. Based on random name selection here the joke is then broken up so that "Chuck Norris" is replaced by the random name selected.
6. You then have a joke with a completely random name in the place of Chuck Norris. 
7. In case of 'r' input , the user is asked if he wants to use a random name , on input 'y' just like the previous case a completely random name is selected from the api , else on input 'n' the the user has to enter a full name with a space between name and surname. This then goes to getMyOwnName() method, where the string is split and it is assigned to the first anme and lastname values to grab a random joke from the pile where it would replace name as provided by the user. 


