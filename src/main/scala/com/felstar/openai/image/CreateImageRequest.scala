package com.felstar.openai.image

/**
 * @param prompt A text description of the desired image(s). The maximum length is 1000 characters. for example: '''A cute baby sea otter'''
 * @param n The number of images to generate. Must be between 1 and 10. for example: '''1'''
 * @param size The size of the generated images. Must be one of `256x256`, `512x512`, or `1024x1024`. for example: '''1024x1024'''
 * @param response_format The format in which the generated images are returned. Must be one of `url` or `b64_json`. for example: '''url'''
 * @param user A unique identifier representing your end-user, which will help OpenAI to monitor and detect abuse. [Learn more](/docs/usage-policies/end-user-ids).  for example: '''user-1234'''
 */
case class CreateImageRequest (
  prompt: String,
  n: Option[Int] = None,
  size: Option[String] = None,
  response_format: Option[String] = None,
  user: Option[String] = None
)

