package com.felstar.openai.model

case class Permission(
                       id: String,
                      `object`: String,
                       created: Long,
                       allow_create_engine: Boolean,
                       allow_sampling: Boolean,
                       allow_logprobs: Boolean,
                       allow_search_indices: Boolean,
                       allow_view: Boolean,
                       allow_fine_tuning: Boolean,
                       organization: String,
                       group: String,
                       is_blocking: Boolean
                     )
