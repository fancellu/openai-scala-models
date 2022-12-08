package com.felstar.openai.completion

/**
 * @param id
 * @param `object`
 * @param created
 * @param model
 * @param choices
 * @param usage
 */
case class CreateCompletionResponse(
                                     id: String,
                                     `object`: String,
                                     created: Long,
                                     model: String,
                                     choices: List[CreateCompletionResponseChoices],
                                     usage: Option[CreateCompletionResponseUsage] = None
                                   )
