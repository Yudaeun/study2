import json
import twitter
from collections import Counter
import requests

twitter_consumer_key = "rr1FZWHkV96tsJNVUyz3yaQxM"
twitter_consumer_secret = "j0Vy7ahfOrVnLQbuDu0OvmIaRkv8lsocvUsJzP1CYH70F5JdeL"
twitter_access_token = "141858321-C4jSlIgSGA5Rj57P0mvxcp8aZ5gUFjK9P9laOlou"
twitter_access_secret = "rAteSAKY3NCqAuMm4JOrYDHqCHIU4UPkshG5x0h0RjB2Y"
twitter_api = twitter.Api(consumer_key=twitter_consumer_key,
                          consumer_secret=twitter_consumer_secret,
                          access_token_key=twitter_access_token,
                          access_token_secret=twitter_access_secret)

import json
query = ["#앙스타장터 리츠"]
output_file_name = "sena.txt"
with open(output_file_name, "w", encoding="utf-8") as output_file:
    stream = twitter_api.GetStreamFilter(track=query)
    while True:
        for tweets in stream:
            tweet = json.dumps(tweets, ensure_ascii=False)
            print(tweet, file=output_file, flush=True)