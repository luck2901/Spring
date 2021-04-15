package com.luck2901.book.springboot.web;

import com.luck2901.book.springboot.domain.posts.PostsRepository;
import com.luck2901.book.springboot.services.posts.PostsService;
import com.luck2901.book.springboot.web.dto.PostsResponseDto;
import com.luck2901.book.springboot.web.dto.PostsSaveRequestDto;
import com.luck2901.book.springboot.web.dto.PostsUpdateRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RequiredArgsConstructor
@RestController
public class PostsApiController {

    private final PostsService postsService;

    @PostMapping("/api/v1/posts")
    public Long save(@RequestBody PostsSaveRequestDto requestDto){
        return postsService.save(requestDto);
    }

    @PutMapping("/api/v1/posts/{id}")
    public Long update(@PathVariable Long id, @RequestBody PostsUpdateRequestDto requestDto){
        return PostsService.update(id, requestDto);
    }

    @GetMapping("/api/v1/posts/{id}")
    public PostsResponseDto findById(@PathVariable Long id){
        return postsService.findById(id);
    }
}
