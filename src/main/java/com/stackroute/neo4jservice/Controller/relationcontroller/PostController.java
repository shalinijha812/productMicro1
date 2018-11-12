package com.stackroute.neo4jservice.Controller.relationcontroller;

import com.stackroute.neo4jservice.domain.nodes.Challenge;
import com.stackroute.neo4jservice.domain.nodes.Concept;
import com.stackroute.neo4jservice.domain.relation.Attempt;
import com.stackroute.neo4jservice.domain.relation.DataModel;
import com.stackroute.neo4jservice.domain.relation.Post;
import com.stackroute.neo4jservice.domain.relation.TypeRelation;
import com.stackroute.neo4jservice.service.relationservice.serviceinterface.AttemptService;
import com.stackroute.neo4jservice.service.relationservice.serviceinterface.PostService;
import com.stackroute.neo4jservice.service.relationservice.serviceinterface.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class PostController {
    private PostService postService;
    private TypeService typeService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("post")
    public ResponseEntity<?> savePost(@RequestBody Post post) {
        ResponseEntity responseEntity;
        System.out.println("........................in controller..........................................."+post);
        Post savedPost = postService.savePost(post);
        responseEntity = new ResponseEntity<Post>(savedPost, HttpStatus.CREATED);
        return responseEntity;
        }

 //   public ResponseEntity<?> savePost(@RequestBody DataModel data) {
        // create a post object from data
//        Post post = new Post();
//        post.setId(data.getId());
//        post.setName(data.getName());
//        post.setChallenge(data.getChallenge());
//        post.setUser(data.getUser());
        // save this post object in database
        // postService.savePost(post);

        // write the logic to fefth the concept from the database based on the concept name
        // Concept concept = repo.getConcept("name");

        // create a type relation to connect two nodes concept and challange
        //TypeRelation tr = new TypeRelation();
        //tr.setId();
        //tr.setName(data.getName());
//        tr.setChallenge(data.getChallenge());
//        tr.setConcept(concept);

        // write the logic to save the typerelation in database
//        typeService.saveTypeRelation()

//        System.out.println("saved post from controller is.............."+ savedPost1);
//        responseEntity = new ResponseEntity<Post>(savedPost1, HttpStatus.CREATED);


    @GetMapping("post")
    public ResponseEntity<?> getAllPosts()
    {
        List<Post> postList;
        postList=postService.getAllPosts();
        ResponseEntity responseEntity=new ResponseEntity<List<Post>>(postList,HttpStatus.OK);
        return responseEntity;
    }
    @DeleteMapping("post/{id}")
    public ResponseEntity<?> deletePost(@PathVariable("id") String id) {
        List<Post> postList;
        ResponseEntity responseEntity;
        String message = postService.deletePost(id);
        responseEntity = new ResponseEntity<String>(message, HttpStatus.OK);
        return responseEntity;
    }
}
