# AnimalFamily

### REST API Endpoints
- GET `/animals` - Return all the animal types
- GET `/animals/{type}` - Return all the animal types who can do the given activity type
- GET `/animals/{activity}/count` Return the count of animals who can do the given activity type

#### List of Activities
- fly
- walk
- swim
- sing 
- talk
 
##how to run the application  
Run `./run.sh` command to compile, run tests and run the application
 - `curl http://localhost:8080/animalFamily/animals` - command to get all animals
 - `curl http://localhost:8080/animalFamily/animals/walk/count` - command to get count of animals by activity
 - `curl http://localhost:8080/animalFamily/animals/walk` - command to get animals by activity

 
### ![design diagram](designDiagram.jpeg)

### Few test responses
- `activity.json`
- `activityCount.json`
- `totalAnimals`