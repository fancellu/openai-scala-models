package com.felstar.openai.image

/**
 * @param created 
 * @param data 
 */
case class ImagesResponse (
  created: Long,
  data: List[ImagesResponseData]
)

