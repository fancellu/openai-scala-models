package com.felstar.openai.edit

/**
 * @param model ID of the model to use. You can use the [List models](/docs/api-reference/models/list) API to see all of your available models, or see our [Model overview](/docs/models/overview) for descriptions of them.
 * @param input The input text to use as a starting point for the edit. for example: '''What day of the wek is it?'''
 * @param instruction The instruction that tells the model how to edit the prompt. for example: '''Fix the spelling mistakes.'''
 * @param n How many edits to generate for the input and instruction. for example: '''1'''
 * @param temperature What [sampling temperature](https://towardsdatascience.com/how-to-sample-from-language-models-682bceb97277) to use. Higher values means the model will take more risks. Try 0.9 for more creative applications, and 0 (argmax sampling) for ones with a well-defined answer.  We generally recommend altering this or `top_p` but not both.  for example: '''1'''
 * @param top_p An alternative to sampling with temperature, called nucleus sampling, where the model considers the results of the tokens with top_p probability mass. So 0.1 means only the tokens comprising the top 10% probability mass are considered.  We generally recommend altering this or `temperature` but not both.  for example: '''1'''
 */
case class CreateEditRequest (
  model: String,
  input: Option[String] = None,
  instruction: String,
  n: Option[Int] = None,
  temperature: Option[BigDecimal] = None,
  top_p: Option[BigDecimal] = None
)

