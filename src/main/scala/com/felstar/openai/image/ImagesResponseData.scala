package com.felstar.openai.image

/**
 * @param url 
 * @param b64_json 
 */
case class ImagesResponseData (
  url: Option[String] = None,
  b64_json: Option[String] = None
)

