# Distance-Aware Competitive Spatiotemporal Searching Using Spatiotemporal Resource Matrix Factorization

This project is based on the <a href="https://github.com/Chessnl/COMSET-GISCUP">COMSET</a> simulator described in the <a href="https://sigspatial2019.sigspatial.org/giscup2019/problem"> 2019 GISCUP Problem Definition</a>.

## Brief description

We employ non-negative matrix factorization (NMF) to predict future distribution of resources. Given the predicted resource distribution, idle agents are directed towards a random nearby location, weighted by this predicted resource distribution. To find a balance between exploration (searching for better locations) and exploitation (remaining in the current location), we use a parameter k that specifies the notion of “nearby”, and another parameter tau to weight nearby locations based on their distance. A third parameter, Delta, defines the time horizon to look for future resource distributions. Finally, a fourth parameter #features defines the number of latent features used in the matrix factorization to model the spatiotemporal resource prediction. All four parameters were optimized on the training data through experimentation.  

Through empirical analysis we found two matrices whose size is relatively small but big enough to yield good performance. We tackled the following challenges:
- Learning spatiotemporal resource distribution
- Predicting future resources
- Avoiding herding
- Avoiding unnecessary long distance trips

Main features of our approach are summarized as follows:
- To avoid herding, each agent has their own random number generator with unique seed number, i.e. agent id. This is to ensure that given the same data, agents  make diverse decision to avoid overfitting.
- To avoid long distance trips, we distribute agents considering distance from each resource.
- Through empirical analysis, we found satisfactory settings such as time horizon for prediction of future resources.


## Structure of project

Besides original COMSET, we added source code and resources as follows:
- src/org/joonseok/comset/
- model/


## How to run simulation

Prerequisite: 
1. Set `comset.agent_class` to `org.joonseok.comset.SmartAgent` in the configuration file (etc/config.properties).
```
comset.agent_class = org.joonseok.comset.SmartAgent
```
2. Make sure that two files `H6.txt` and `W6.txt` in directory `model` exist.


3. To run simulation, you can execute Main class with mvn as follows:
```
mvn exec:java -Dexec.mainClass="Main"
```


## Resources

Joon-Seok Kim, Dieter Pfoser, and Andreas Züfle, <i>Distance-Aware Competitive Spatiotemporal Searching Using Spatiotemporal Resource Matrix Factorization (GIS Cup)</i>, In the 27th ACM SIGSPATIAL International Conference on Advances in Geographic Information Systems (SIGSPATIAL'19),November 5–8, 2019, Chicago, IL, USA. https://doi.org/10.1145/3347146.3363350

Project Website: <a href="http://giscup19.joonseok.org/">http://giscup19.joonseok.org/</a>


## Authors

* **Joon-Seok Kim**
* **Dieter Pfoser**
* **Andreas Züfle**

