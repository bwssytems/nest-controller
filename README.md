# nest-controller
Java library to utilize for calling the Nest cloud to control your Thermostats and Home status.
## Build
To customize and build it yourself, build a new jar with maven:  
```
mvn install
```
Another way to include this project is thru the use of jitpack.io to include this as a Maven item:
```
	<repositories>
		<repository>
	    	<id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>

	<dependencies>
		<dependency>
		    <groupId>com.github.bwssytems</groupId>
		    <artifactId>nest-controller</artifactId>
		    <version>1.0.0</version>
		</dependency>
	</dependencies>
```
Otherwise, downloads are available at https://github.com/bwssytems/nest-controller/releases.
## Dependencies
When using this library you will need the following in your maven build or the equivalent jars included with your distribution:
```
		<dependency>
			<groupId>org.apache.httpcomponents</groupId>
			<artifactId>httpclient</artifactId>
			<version>4.5.1</version>
		</dependency>
		<dependency>
			<groupId>org.apache.httpcomponents</groupId>
			<artifactId>httpcore</artifactId>
			<version>4.4.4</version>
		</dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>slf4j-simple</artifactId>
            <version>1.7.5</version>
        </dependency>
        <dependency>
            <groupId>org.slf4j</groupId>
            <artifactId>log4j-over-slf4j</artifactId>
            <version>1.7.5</version>
        </dependency>
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.2.4</version>
        </dependency>
```
## Usage
To start using the controller, the following items need to be done:
```

		NestSession theSession = null;

		try {
			theSession = new NestSession(username, password);
		} catch (LoginException e) {
			System.out.println("Caught Login Exception, exiting....");
			System.exit(1);
		}

		Nest theNest = new Nest(theSession);

		Set<String> homeNames = theNest.getHomeNames(); /* list of home structures  i.e. MyHouse */
		Home aHome = aHome = theNest.getHome(homeNameFromSet);

		aHome.setAway(Boolean.FALSE); /* either TRUE or FALSE "/

		Set<String> thermoNames = theNest.getThermostatNames(); /* list of thermostats in all structure */
		Thermostat thermo1 = thermo1 = theNest.getThermostat(thermoNameFromSet);

		Float targetTemp = new Float(25.2790765); /* always a float and in celsius */
		thermo1.setTargetTemperature(targetTemp);

		String targetType = "range"; /* heat, cool, range or off */
		thermo1.setTargetType(targetType);

		String fanmode = "auto"; /* on or auto */
		thermo1.setFanMode(fanmode);
```