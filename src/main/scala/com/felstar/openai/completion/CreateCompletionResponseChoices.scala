package com.felstar.openai.completion

/**
 * @param text
 * @param index
 * @param logprobs
 * @param finish_reason
 */
case class CreateCompletionResponseChoices(
                                            text: Option[String] = None,
                                            index: Option[Int] = None,
                                            logprobs: Option[CreateCompletionResponseLogprobs] = None,
                                            finish_reason: Option[String] = None
                                          )
