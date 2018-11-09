package com.stackroute.neo4jservice.Controller.relationcontroller;

import com.stackroute.neo4jservice.domain.nodes.Challenge;
import com.stackroute.neo4jservice.domain.relation.Attempt;
import com.stackroute.neo4jservice.domain.relation.Post;
import com.stackroute.neo4jservice.service.relationservice.serviceinterface.AttemptService;
import com.stackroute.neo4jservice.service.relationservice.serviceinterface.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class PostController {
    private PostService postService;

    @Autowired
    public PostController(PostService postService) {
        this.postService = postService;
    }

    @PostMapping("post")
    public ResponseEntity<?> savePost(@RequestBody Post post) {
        ResponseEntity responseEntity;
        Post savedPost = postService.savePost(post);
        responseEntity = new ResponseEntity<Post>(savedPost, HttpStatus.CREATED);

        return responseEntity;
    }
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
