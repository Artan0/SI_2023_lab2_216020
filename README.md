Артан Бајрам, бр. на индекс 216020

Control Flow Graph

![lab 2 cfg Diagram](https://github.com/Artan0/SI_2023_lab2_216020/assets/95352886/8c320d7b-d1f8-4919-a1a4-97182a6898a1)

Цикломатска комплексност

Еден начин за пресметување на цикломатската комплексност е користење на бројот на предикати во кодот. 
Предикатни јазли се места во кодот каде што се прават одлуки (услови) и се разгранува извршувањето на кодот на различни патеки.
Цикломатската комплексност е еднаква на бројот на предикати плус 1.
Цикломатската комплексност изнесува 10+1=11.

Every Branch

Test case 1 (testWithNullUser): This test case covers Branch 1 by passing a null user object.
Test case 2 (testWithNullPassword): This test case covers Branch 2 by passing a user object with a null password.
Test case 3 (testWithNullEmail): This test case covers Branch 3 by passing a user object with a null email.
Test case 4 (testWithNullUsername): This test case covers Branch 4 by passing a user object with a null username.
Test case 5 (testWithExistingEmailAndUsername): This test case covers Branch 5 by adding a user with the same email in the allUsers list.
Test case 6 (testWithValidPassword): This test case covers the default branch with a valid user object and an empty allUsers list.
Test case 7 (testWithPasswordContainingUsername): This test case covers the default branch by passing a user object with a password that contains the username.
Test case 8 (testWithShortPassword): This test case covers the default branch by passing a user object with a short password.
Test case 9 (testWithPasswordContainingSpace): This test case covers the default branch by passing a user object with a password that contains a space.
Test case 10 (testWithPasswordWithoutSpecialCharacter): This test case covers the default branch by passing a user object with a password that doesn't contain a special character.


Multiple Condition
if (user == null  user.getPassword() == null  user.getEmail() == null)
Test case 1: ako user == null  se ispolnuva uslovot
Test case 2: ako user != null, user.GetPassword() == null
Test case 3: ako user != null, user.GetPassword() != null и GetEmail() == null
Test case 4: ako user != null, user.GetPassword() != null и GetEmail() != null
