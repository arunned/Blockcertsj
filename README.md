# Blockcertsj

Blockcerts is an open source and open standard for building apps that issue and verify blockchain-based official records. As a newbie, I struggled to run the docker image and the python program to create a valid certificate and to understand each block of data. It took me a while to understand that anchoring the merkle root in a blockchain is optional. This easy to use code simply creates the JSON file that passes remote validation. 

Hence, I created a simple Java program with java objects for each block that can be easily converted into final JSON. 

# Goal 

Build a JSON file in Java using java objects, use default input data, generate local hash and build signature block. Pass remote validation in blockcerts.org by inputting the generated json file. 

# Steps

 - git clone/Download
 - import/open project in Eclipse
 - go to CreateCertificate.java file
 - "Run" as Java application
 - Output JSON file will be created in the eclipse-workspace project directory and filename will be shown in the console
 - go to blockcerts.org in the browser
 - Click choose json file and pick the newly created .json file
 - blockcerts will show "This Mocknet credential passed all checks"
 - That's it. Change the default values and see how it affects validation


### Todos

 - Add signature object specific to Bitcoin and Ethereum

# acknowledgements
Thanks to the projects below from which I was able to re-use code. 

https://github.com/BlockTechCert/BTCert

https://github.com/boumba100/JsonldAndroid


License
----

MIT


