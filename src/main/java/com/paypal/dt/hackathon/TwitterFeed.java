package com.paypal.dt.hackathon;

import java.util.List;

import twitter4j.FilterQuery;
import twitter4j.Location;
import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.ResponseList;
import twitter4j.StallWarning;
import twitter4j.Status;
import twitter4j.StatusDeletionNotice;
import twitter4j.StatusListener;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.TwitterStream;
import twitter4j.TwitterStreamFactory;
import twitter4j.User;
import twitter4j.api.TweetsResources;
import twitter4j.conf.ConfigurationBuilder;

public class TwitterFeed {

	public static void main(String[] args) {
		// if (args.length < 1) {
		// System.out.println("java twitter4j.examples.search.SearchTweets [query]");
		// System.exit(-1);
		// }
		// Twitter twitter = new TwitterFactory().getInstance();
		// try {
		// Query query = new Query("paypal");
		// QueryResult result;
		// do {
		// result = twitter.search(query);
		// List<Status> tweets = result.getTweets();
		// for (Status tweet : tweets) {
		// System.out.println("@" + tweet.getUser().getScreenName() + " - " +
		// tweet.getText());
		// }
		// } while ((query = result.nextQuery()) != null);
		// System.exit(0);
		// } catch (TwitterException te) {
		// te.printStackTrace();
		// System.out.println("Failed to search tweets: " + te.getMessage());
		// System.exit(-1);
		// }

		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
				.setOAuthConsumerKey("yxKfPHJ3ZapW5ys5mU2bEC2VJ")
				.setOAuthConsumerSecret(
						"zaK7ZQ69CWEhuu7L0zKhvEWzlPHjMDNkXwGj0KAEZ2neE0NnBS")
				.setOAuthAccessToken(
						"64963193-NAz1eZTeIuv1XO4sO0zuFwACSPOytNxLbarMrGBEH")
				.setOAuthAccessTokenSecret(
						"6jqy0xAf9795wcps4eS4aSZd2rZSQaIzqTO6erIcsjUh3");
		// TwitterFactory tf = new TwitterFactory(cb.build());
		// Twitter twitter = tf.getInstance();

		// getTrends(cb);
//		getSample(cb);
		getHashTag(cb);
	}

	static void getHashTag(ConfigurationBuilder cb) {
		Twitter twitter = new TwitterFactory(cb.build()).getInstance();
		System.out.println("Fetching Weather Data...");
		Query query = new Query("#Bestbuy");
		// query.set; // 100 results per page
		query.setCount(100);
		QueryResult qr;
		try {
			qr = twitter.search(query);
			List<Status> qrTweets = qr.getTweets();

			// break out if there are no more tweets
			if (qrTweets.size() == 0) {
				return;
			}

			// separate tweets into good and bad bins
			for (Status t : qrTweets) {
//				t.getGeoLocation().
				;
				System.out.println(t.getUser().getScreenName()+","+t.getUser().getName()+","+t.getText());
				// if (t.getText().toLowerCase().contains("happy") ||
				// t.getText().toLowerCase().contains("love")) {
				// goodWeather.add(t);
				// }
				//
				// if (t.getText().toLowerCase().contains("sad") ||
				// t.getText().toLowerCase().contains("hate")) {
				// badWeather.add(t);
				// }
			}
		} catch (TwitterException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void getTrends(ConfigurationBuilder cb) {
		try {
			Twitter twitter = new TwitterFactory(cb.build()).getInstance();
			ResponseList<Location> locations;
			final TweetsResources tweets = twitter.tweets();
			// twitter.se
			// locations = twitter.getAvailableTrends();
			System.out.println("Showing available trends");
			// tweets.
			// for (TweetsResources tweet : tweets) {
			// // System.out.println(location.getName() + " (woeid:"
			// // + location.getWoeid() + ")");
			// }
			System.out.println("done.");
			System.exit(0);
		} catch (Exception te) {
			te.printStackTrace();
			System.out.println("Failed to get trends: " + te.getMessage());
			System.exit(-1);
		}
	}

	private static void getSample(ConfigurationBuilder cb) {
		TwitterStream twitterStream = new TwitterStreamFactory(cb.build())
				.getInstance();
		// RawStreamListener listener = new RawStreamListener() {
		// @Override
		// public void onMessage(String rawJSON) {
		// System.out.println(rawJSON);
		// }
		//
		// @Override
		// public void onException(Exception ex) {
		// ex.printStackTrace();
		// }
		// };
		StatusListener listener = new StatusListener() {

			@Override
			public void onException(Exception arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onDeletionNotice(StatusDeletionNotice arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onScrubGeo(long arg0, long arg1) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onStatus(Status status) {
				User user = status.getUser();

				// gets Username
				String username = status.getUser().getScreenName();
				System.out.println(username);
				// String profileLocation = user.getLocation();
				// System.out.println(profileLocation);
				long tweetId = status.getId();
				System.out.println(tweetId);
				String content = status.getText();
				System.out.println(content + "\n");

			}

			@Override
			public void onTrackLimitationNotice(int arg0) {
				// TODO Auto-generated method stub

			}

			@Override
			public void onStallWarning(StallWarning arg0) {
				// TODO Auto-generated method stub

			}

		};

		final FilterQuery fq = new FilterQuery();
		String keywords[] = { "Flipkart" };
		fq.track(keywords);

		twitterStream.addListener(listener);
		twitterStream.filter(fq);

		twitterStream.sample();
	}
}
