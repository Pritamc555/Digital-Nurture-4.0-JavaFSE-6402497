import React, { Component } from 'react';

class Posts extends Component {
  constructor(props) {
    super(props);
    this.state = {
      posts: []
    };
  }

  componentDidMount() {
    this.loadPosts();
  }

  loadPosts() {
    fetch('https://jsonplaceholder.typicode.com/posts')
      .then(response => response.json())
      .then(data => {
        this.setState({ posts: data });
      })
      .catch(error => {
        console.error('Error fetching posts:', error);
      });
  }

  componentDidCatch(error, info) {
    alert('An error occurred while rendering Posts.');
    console.error('Error info:', info);
  }

  render() {
    return (
      <div>
        <h2>Blog Posts</h2>
        {this.state.posts.map(post => (
          <div key={post.id} style={{ marginBottom: '20px' }}>
            <p><strong>User ID:</strong> {post.userId}</p>
            <p><strong>ID:</strong> {post.id}</p>
            <p><strong>Title:</strong> {post.title}</p>
            <p><strong>Body:</strong> {post.body}</p>
            <hr />
          </div>
        ))}
      </div>
    );
  }
}

export default Posts;
