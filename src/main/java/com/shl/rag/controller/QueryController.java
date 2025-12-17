
package com.shl.rag.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class QueryController {

 @PostMapping("/query")
 public Map<String,Object> query(@RequestBody Map<String,String> body) {
  Map<String,Object> res = new HashMap<>();
  res.put("query", body.get("query"));
  res.put("recommendations", List.of(
    Map.of("product","SHL Verify Cognitive Ability","score",0.87),
    Map.of("product","SHL OPQ Personality","score",0.81)
  ));
  return res;
 }
}
