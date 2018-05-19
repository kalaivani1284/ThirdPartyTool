set projectLocation=C:\Users\sivak\Desktop\vani\ToolsDemo

cd %projectLocation%


set classpath=%projectLocation%\bin;%projectLocation%\Jars\*

java org.testng.TestNG %projectLocation%\testng.xml

pause