package com.felstar.openai.moderation

/**
 * @param id 
 * @param model 
 * @param results 
 */
case class CreateModerationResponse (
  id: String,
  model: String,
  results: List[CreateModerationResponseResults]
)

