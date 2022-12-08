package com.felstar.openai.edit

import com.felstar.openai.completion.{CreateCompletionResponseChoices, CreateCompletionResponseUsage}

/**
 * @param id 
 * @param `object` 
 * @param created 
 * @param model 
 * @param choices 
 * @param usage 
 */
case class CreateEditResponse (
  id: String,
  `object`: String,
  created: Long,
  model: String,
  choices: List[CreateCompletionResponseChoices],
  usage: CreateCompletionResponseUsage
)

