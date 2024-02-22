import './App.css';
import Counter from './Counter';
import CounterState from './CounterState';
import StateSample from './StateSample';

function App() {
  return (
    <div className="App">
      <h1>🎱 React Test 🎱</h1>
      <CounterState/>
      <StateSample/>
      <Counter superName="쿠크다스" superType="과자">내용</Counter>
    </div>
  );
}

export default App;
