Feature: Test Applications in androidplatforms

#@Web_Emulator
#Scenario: Launch a web browser in web emulator environment
#Given Open browser and navigate to url
#And Enter "standard user" in username textbox
#And Enter "secret_sauce" in password textbox
#Then Click on login button in swaglabs loginpage

#@Native_Emulator
#Scenario: Launch Calculator application in native emulator environment
 #Given Open a calucator app in android device in native emulator environment
 #When  I need to click on "08" button 
 #And   I need to click on plus button
 #When   I need to click on "05" button
 #And   I need to click on equal button
 
@Web_RealTime
Scenario: Launch a web browser in web realtime environment
Given Open browser and navigate to url
And Enter "standard user" in username textbox
And Enter "secret_sauce" in password textbox
Then Click on login button in swaglabs loginpage

#@Native_Realtime
#Scenario: Launch Calculator application in native realtime environment
 #Given Open a calucator app in android device in native realtime environment
 #When  I need to click on "08" button 
 #And   I need to click on plus button
 #When   I need to click on "05" button
 #And   I need to click on equal button